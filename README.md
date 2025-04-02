# api-testing-framework
A Rest Assured TestNG project based on Gradle


###### {JSON} Placeholder API Test-plan
###### Base URL: https://jsonplaceholder.typicode.com   
###### Test-Plan: [High Level Test-PLan](https://docs.google.com/document/d/1ikxYHxmBKlDjsMIVg_KdT8QKXvNwFzsg7KcE__J8zbY/edit?usp=sharing)

##### Six common resources:

/posts	100 posts  
/comments	500 comments  
/albums	100 albums  
/photos	5000 photos  
/todos	200 todos  
/users	10 users  

Resources have relations. For example: posts have many comments, albums have many photos.

##### Routes
###### All HTTP methods are supported, http/https for your requests.

GET	/posts  
GET	/posts/1  
GET	/posts/1/comments  
GET	/comments?postId=1  
POST /posts  
PUT	/posts/1  
PATCH	/posts/1  
DELETE	/posts/1  
