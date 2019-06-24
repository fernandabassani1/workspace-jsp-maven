<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<c:import url="sidebar.jsp"/>

<div id="content-wrapper">

      <div class="container-fluid">

        <!-- Breadcrumbs-->
         <ol class="breadcrumb">
          <li class="breadcrumb-item">
            <a href="listaFuncionario">Lista-Funcionarios</a>
          </li>
          <li class="breadcrumb-item active">Visualizar</li>
        </ol>
     
       <!--JSP DE CADASTRO-->
     <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">Cadastrar</div>
      <div class="card-body">
		<form action="<c:url value = "cadastraFuncionario"/>" method="post">
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <div class="form-label-group">
                  <input type="text" id="firstName" class="form-control" placeholder="First name" name="nome" autofocus="autofocus">
                  <label for="firstName" >nome</label>
                </div>
              </div>
              <div class="col-md-6">
                <div class="form-label-group">
                  <input type="email" id="inputEmail" class="form-control" placeholder="Email address" name="email">
              <label for="inputEmail">email</label>
                </div>
              </div>
            </div>
          </div>
          <div class="form-group">
            <div class="form-label-group">
             <input type="text" id="lastName" class="form-control" placeholder="Last name" name="rg">
                  <label for="lastName">identificação</label>
            
            </div>
          </div>
          <button class="btn btn-primary btn-block" type="submit">Registrar </button>
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="#">Login Page</a>
          <a class="d-block small" href="#">Forgot Password?</a>
        </div>
      </div>
    </div>
  </div>

      </div>
      <!-- /.container-fluid -->

      <!-- Sticky Footer -->
      <c:import url="footer.jsp"/>
