<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Please sign in</title>
  </head>
  <body>
     <div class="container">
      <form class="form-signin" method="post" action="/helloSpringMVC/login">
        <h2 class="form-signin-heading">Login</h2>
        <c:if test="${not empty errormsg}">
        <h4>${errormsg}</h4>
        </c:if>
        <p>
          <label for="username" class="sr-only">ID : </label>
          <input type="text" id="username" name="username" class="form-control" placeholder="ID" required autofocus>
        </p>
        <p>
          <label for="password" class="sr-only">PW : </label>
          <input type="password" id="password" name="password" class="form-control" placeholder="PW" required>
        </p>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <button class="btn btn-lg btn-primary btn-block" type="submit">로그인</button>
      </form>
</div>
</body></html>