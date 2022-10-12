package demo;

//video reference = https://www.youtube.com/watch?v=9oq7Y8n1t00

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class apicall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       var url= "https://jsonplaceholder.typicode.com/posts/10";
       System.out.println(url);
     try {  HttpRequest request =(HttpRequest) HttpRequest.newBuilder()
    		   .uri(new URI(url))
    		   .GET()
    		   .build();
               
     HttpClient httpclint = HttpClient.newHttpClient();
     HttpResponse<String> response = httpclint.send(request,BodyHandlers.ofString());
     System.out.println(response.body());
     }
     catch(Exception e){System.out.println("exception");}
       
	}

}
