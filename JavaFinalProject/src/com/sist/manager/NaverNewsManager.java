package com.sist.manager;

// 네이버 검색 API 예제 - 블로그 검색
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class NaverNewsManager {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String fd=scan.next();
		List<NewsVO> list=newsSerchData(fd);
		for(NewsVO vo:list)
		{
			System.out.println(vo.getTitle());
			System.out.println(vo.getContent());
			System.out.println(vo.getLink());
			System.out.println(vo.getDate());
			System.out.println("=============================");
		}
	}
    public static List<NewsVO> newsSerchData(String fd) {
    	List<newsVO> list=new ArrayList<newsVO>();
        String clientId = "AZBOj5rn6VLtwwVMXXVj"; //애플리케이션 클라이언트 아이디
        String clientSecret = "O7uFihkUoP"; //애플리케이션 클라이언트 시크릿


        String text = null;
        try {
            text = URLEncoder.encode(fd, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("검색어 인코딩 실패",e);
        }


        String apiURL = "https://openapi.naver.com/v1/search/news.json?query=" + text;    // JSON 결과
        //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // XML 결과


        Map<String, String> requestHeaders = new HashMap<>();
        requestHeaders.put("X-Naver-Client-Id", clientId);
        requestHeaders.put("X-Naver-Client-Secret", clientSecret);
        String responseBody = get(apiURL,requestHeaders);

        // { 
        // System.out.println(responseBody);
        // { => JSONObject
        // [ => JSONArray
        // JSON : 자바스크립트의 객체 표현법 {"key":값...}
        // JSON은 호환성이 좋다 => 모바일, 브라우저에 데이터를 묶어서 전송하는 기술
        // JSON : Ajex, VueJS, ReactJS
        // 자바 = 자바스크립트 연동 (Rest)
        // 2. JSON (98%)
        // VO => {} , List => []
        try
        {
        	JSONParser jp=new JSONParser();
        	JSONObject root=(JSONObject)jp.parse(responseBody);
        	JSONArray arr=(JSONArray)root.get("items");
        	//System.out.println(arr.toJSONString());
        	/*
        	 * 
        	 */
        	for(int i=0;i<arr.size();i++)
        	{
        		NewsVO vo=new NewsVO();
        		JSONObject obj=(JSONObject)arr.get(i);
        		String title=(String)obj.get("title");
        		String content=(String)obj.get("decreption");
        		String link=(String)obj.get("link");
        		String date=(String)obj.get("pubDate");
        		date=new SimpleDateFormat("yyyy-MM-dd").format(new Date(date));
        		vo.settitle(title);
        		vo.setContent(content);
        		vo.setLink(link);
        		vo.setDate(date);
        		li
        	}
        }catch(Exception ex) {}
        return list;
    }


    private static String get(String apiUrl, Map<String, String> requestHeaders){
        HttpURLConnection con = connect(apiUrl);
        try {
            con.setRequestMethod("GET");
            for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
                con.setRequestProperty(header.getKey(), header.getValue());
            }


            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
                return readBody(con.getInputStream());
            } else { // 오류 발생
                return readBody(con.getErrorStream());
            }
        } catch (IOException e) {
            throw new RuntimeException("API 요청과 응답 실패", e);
        } finally {
            con.disconnect();
        }
    }


    private static HttpURLConnection connect(String apiUrl){
        try {
            URL url = new URL(apiUrl);
            return (HttpURLConnection)url.openConnection();
        } catch (MalformedURLException e) {
            throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
        } catch (IOException e) {
            throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
        }
    }


    private static String readBody(InputStream body){
        InputStreamReader streamReader = new InputStreamReader(body);


        try (BufferedReader lineReader = new BufferedReader(streamReader)) {
            StringBuilder responseBody = new StringBuilder();


            String line;
            while ((line = lineReader.readLine()) != null) {
                responseBody.append(line);
            }


            return responseBody.toString();
        } catch (IOException e) {
            throw new RuntimeException("API 응답을 읽는 데 실패했습니다.", e);
        }
    }
}