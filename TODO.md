###
* Split security XML on two parts

* Nice to have: Create a tests
-> * Nice to have: Create two subprojects (one with Ext Aut, other without)     

ui-user

### Spring security documentation

https://docs.spring.io/spring-security/site/docs/4.0.3.RELEASE/reference/htmlsingle/#ns-getting-started
https://docs.spring.io/spring-security/reference/servlet/configuration/xml-namespace.html#ns-getting-started

### Configuration  parsing

SecurityNamespaceHandler
    HttpSecurityBeanDefinitionParser 
        createFilterChain
            AuthenticationConfigBuilder
                createBasicFilter
                    new BasicAuthenticationFilter

### Servlet filter

BasicAuthenticationFilter
    doFilter
        Authentication authResult = this.authenticationManager.authenticate(authRequest);

UsernamePasswordAuthenticationFilter - POST username password
    doFilter
        return this.getAuthenticationManager().authenticate(authRequest);

### Check user password 

AuthenticationManager
    List<authenticationProvider>

### Pattern matcher

FilterChainProxy.java:248


