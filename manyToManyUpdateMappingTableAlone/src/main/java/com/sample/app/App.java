package com.sample.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	public static void main(String args[]) {
		SpringApplication.run(App.class, args);
	}

}


/*

{
"firstName": "rajib",
"lastName": "samanta",
"projectDtos": [
    {
        "projectName": "java",
        "teamSize": 5
    },
    {
        "projectName": "Spring",
        "teamSize": 7
    }
]
}


*/

/*

{
	"projectName": "jpa",
    "teamSize": 9,
    "employeeDtos": [
        {
            "firstName": "sachin",
            "lastName": "tendulkar"
        },
        {
            "firstName": "rahul",
            "lastName": "dravid"
        }
    ]
}


*/