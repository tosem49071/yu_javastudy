package com.sist.Travel;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



public class test {
    static String detailURL="";
    public static void main(String[] args) {
        List <TravelVO> list = new ArrayList<TravelVO>();
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos= new FileOutputStream("C:\\java_datas\\travel.txt");
            oos = new ObjectOutputStream(fos);
            int c =1;
            String [] urls2 = {"attractions","nature","entertainment","shopping","restaurants","hotels","seoul-stay"};

            for(int i =0 ; i < urls2.length;i++) {
//                String pages = "https://korean.visitseoul.net/"+urls2[i]+"?curPage=";
                String pages = "https://korean.visitseoul.net/"+urls2[i]+"?curPage=";
                for(int j = 1 ; j <= 5; j++) {
                    String url = pages;
                    url = url+j;
//                    System.out.println(url);
                    Document doc = Jsoup.connect(url).get();
                    Elements title = doc.select("div.article-list-slide span.title");
                    Elements contents = null;
                    Elements href = doc.select("li.item a"); // 기존 url 뒤에 붙는 상세 url
                    Elements poster = null;
                    if(!url.contains("hotels")){ //
                        contents = doc.select("div.infor-element-inner span.small-text");
                        if(url.contains("seoul-stay")){
                            poster = doc.select("div.thumb img");
                        }
                        else {
                            poster = doc.select("div.thumb");
                        }
                    }
                    else{ //호텔의 경우 : 상세보기가 없어 리뷰 수 출력
                        contents = doc.select("div.infor-element-inner span.trip-text");
                        poster = doc.select("div.thumb img"); // 호텔의 이미지는 바로 받을 수 있다.
                    }
                    for(int k=0; k<title.size(); k++) {
                        TravelVO vo = new TravelVO();
                        // 출력
                        System.out.println("고유번호"+c);
                        System.out.println("카테고리번호:"+(i+1));
                        System.out.println(title.get(k).text());
                        System.out.println(contents.get(k).text());
                        String posterUrl="";
                        if(!url.contains("hotels")&&!url.contains("seoul-stay")){
                            String str = poster.get(k).attr("style");
                            str = str.substring(str.indexOf("(")+1,str.lastIndexOf(")"));
                            posterUrl= "https://korean.visitseoul.net"+str;
                            System.out.println(posterUrl);
                        }
                        else { // url이 호텔과 게스트하우스인경우
                            posterUrl = poster.get(k).attr("src");
                            System.out.println(posterUrl);
                        }

//                        detailURL = href.get(k).attr("href");
//                        System.out.println("https://korean.visitseoul.net/"+detailURL);
//                        doc = Jsoup.parse("https://korean.visitseoul.net/"+urls2[i]+detailURL);
//                        Element poster = doc.select("div.wide-slide-element div[style]").first();
//                        String str = poster.attr("style");
//                        str = str.substring(str.indexOf("\'"),str.lastIndexOf("\'"));
//                        System.out.println(str);
                        // VO에 데이터 넣기

                        vo.setNo(c);
                        vo.setCno(k);
                        vo.setTitle(title.get(k).text());
                        vo.setContents(contents.get(k).text());
                        vo.setPoster(posterUrl);
                        list.add(vo);
                        c++;
                    }
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally {
            try {

            } catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }
        }
    }



}
