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
            <a href="cadastraProduto.jsp">Cadastrar - Produto</a>
          </li>
        </ol>
     
       <!--JSP DE CADASTRO-->
       <div class="card mb-3">
          <div class="card-header">
            <i class="fas fa-table"></i>
            Produtos</div>
          <div class="card-body">
            <div class="table-responsive">
              <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                <thead>
                  <tr>
                    <th>Produto</th>
                    <th>Valor</th>
                    <th colspan="2" style="text-align: center">Op��es</th>
                    
                  </tr>
                </thead>
                <tfoot>
                  <tr>
                    <th>Produto</th>
                    <th>Valor</th>
    				<th style="text-align: center">Op��es</th>
                  </tr>
                  
                </tfoot>
                <tbody>
                <c:forEach var="produto" items="${produtos}">
                  <tr>
                    <td>${produto.descricao}</td>
                    <td>${produto.vlrUnitario}</td>
                    
                    <td colspan="2" style=" text-align: center;">
                    <a href="populaFormProduto?id=${produto.id}" > 
                    <i class="fas fa-edit" ></i>
                    </a>
                    <a href="excluirProduto?id=${produto.id}">
					<i class="fas fa-trash-alt"  style="color: red;"></i>                       
                     </a> 
                    </td>
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
