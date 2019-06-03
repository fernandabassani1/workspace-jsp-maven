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
            <a href="cadastraClienteForm">Cadastrar-Cliente</a>
          </li>
        </ol>
     
       <!--JSP DE CADASTRO-->
       <div class="card mb-3">
          <div class="card-header">
            <i class="fas fa-table"></i>
            Clientes</div>
          <div class="card-body">
            <div class="table-responsive">
              <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                <thead>
                  <tr>
                    <th>Nome</th>
                    <th>Sobrenome</th>
                    <th>Email</th>
                    <th>Documento</th>
                    <th>Telefone</th>
                    <th>Endereço</th>
                    <th>cep</th>
                  </tr>
                </thead>
                <tfoot>
                  <tr>
                    <th>Nome</th>
                    <th>Sobrenome</th>
                    <th>Email</th>
                    <th>Documento</th>
                    <th>Telefone</th>
                    <th>Endereço</th>
                    <th>Cep</th>
                  </tr>
                </tfoot>
                <tbody>
                <c:forEach var="cliente" items="${clientes}">
                  <tr>
                    <td>${cliente.nome}</td>
                    <td>${cliente.sobrenome}</td>
                    <td>${cliente.email}</td>
                    <td>${cliente.documento}</td>
                    <td>${cliente.telefone}</td>
                    <td>${cliente.endereco}</td>
                    <td>${cliente.cep}</td>
                    
                  </tr>
                  </c:forEach>
                </tbody>
              </table>
            </div>
          </div>
          <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
        </div>

      </div>
      <!-- /.container-fluid -->

      <!-- Sticky Footer -->
      <c:import url="footer.jsp"/>
