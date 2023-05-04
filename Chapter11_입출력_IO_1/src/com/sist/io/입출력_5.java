package com.sist.io;
import java.io.*;
import java.net.*;
/*
 *     URLConnection => url.openConnection()
 *         |
 *     ------------------------
 *     |                      |
 *    HttpURLConnection  HttpsURLConnection
 *     
 *     class A
 *     class B extends A
 *     
 *     B b=(B)new A(); ==> 오류
 *     
 *     int a=(int)10.5
 */

public class 입출력_5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		URL url=new URL("https://www.10000recipe.com/recipe/list.html");
		HttpURLConnection conn=
				(HttpURLConnection)url.openConnection();
		// 연결이 되었다면
		if(conn!=null)
		{
			// 브라우저 => 1byte씩 전송
			// 1byte => 2byte로 변환
			// InputStreamReader
			BufferedReader in=
					new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			                             //--------------------- 한글파일 안깨진 이유    ------ unicode transfer f
			while(true)
			{
				String data=in.readLine();
				if(data==null) break;
				System.out.println(data);
			}
			in.close();
			conn.disconnect();
		}
	}

}
