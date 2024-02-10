# Scenario
Send a GET request to the address https://jsonplaceholder.typicode.com/posts/22     
Test whether the status code of the returned response is 200, and whether the response body is the same as the one provided below :        

Response body :     

        {         
           "userId": 3,      
           "id": 22,      
           "title": "dolor sint quo a velit explicabo quia nam",        
           "body": "eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita earum mollitia molestiae aut atque rem          
            suscipit\nnam impedit esse"      
        }

First, perform manual tests in Postman. The steps for conducting the tests are as follows:    

1.After creating a collection named JsonPlaceHolder, click on the collection. Define the base URL of the endpoint to be requested from the Variables section.    

![JsonPlaceHolderVariable](https://github.com/cylnesra/API-test-automation-and-manual-testing/assets/87074889/58257c38-82f8-4081-9444-f868de9659ad)        

2.Click on add request, and send a GET request to the relevant address.    

![JsonPlaceHolderAddGetRequest](https://github.com/cylnesra/API-test-automation-and-manual-testing/assets/87074889/a248155b-7750-42cf-aac2-325eba8cdfca)    

3.Compare the status code and response body of the incoming response with the scenario you have.   

![JsonPlaceHolderGetResponse](https://github.com/cylnesra/API-test-automation-and-manual-testing/assets/87074889/d5713c0c-8b35-4c75-a5df-a162d4d6890a)                

4.Finally, after receiving a successful response, save this test in Postman by clicking on the 'Save' option.




