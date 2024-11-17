1. We can use the annotation @PreAuthorize(hasRole('ADMIN')) to authorize the selected user for the access of the endpoints
2. The above annotation is passed to the method inside the controller class.
3. After passing this annotation, it is necessary to add a new annotation @EnableGlobalMethodSecurity(prePostEnabled= true) in the security class.
4. .csrf() needs to be disabled if the client is non browser
5. .csrf() protects the client from the csrf attack(1:44:00)
6. .httpBasic() is the basic authentication
7. .formLogin() is the form login authentication where the client can logout.
8. In form based authentication, when the client signs in the session id is stored as a cookie and the browser validates
the user on the basis of session id.
9. 