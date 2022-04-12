# RestAPI

Implemented an application in java which provides a REST API with endpoints for searching,
creating and deleting “server” objects:
● GET servers. Should return all the servers if no parameters are passed. When server id
is passed as a parameter - return a single server or 404 if there’s no such a server.
● PUT a server. The server object is passed as a json-encoded message body.
● DELETE a server. The parameter is a server ID.
● GET (find) servers by name. The parameter is a string. Must check if a server name
contains this string and return one or more servers found. Return 404 if nothing is found.


# Screenshots of the output
Using Postman

   # For Getting data
     ![image](https://user-images.githubusercontent.com/73607151/163025252-bd3b1459-0633-4c4e-93c6-f668224a6972.png)

   # For finding a data by name
     ![image](https://user-images.githubusercontent.com/73607151/163025576-972e9413-e261-41e6-92be-a79728e23b6a.png)
     
   # For data not foud
     ![image](https://user-images.githubusercontent.com/73607151/163025892-8eaf5257-30ad-4a3a-bec8-5447acb933b4.png)
     
   # For editting the data
     ![image](https://user-images.githubusercontent.com/73607151/163025665-395f8463-3e5d-4898-999a-1c267d4c84cf.png)
     
   # For deleting the data
     ![image](https://user-images.githubusercontent.com/73607151/163025786-7ae04b27-2bdf-44ee-865a-bbf08ff98528.png)




