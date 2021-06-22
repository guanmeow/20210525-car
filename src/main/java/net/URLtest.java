package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class URLtest {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://quality.data.gov.tw/dq_download_json.php?nid=11688&md5_url=9bbac2987cfd35e5ba52de1c1f39a5c3");
//            http://ws.kinmen.gov.tw/001/Upload/0/relfile/0/0/e3717d5f-d538-405a-a077-c90af64ff75a.json
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
