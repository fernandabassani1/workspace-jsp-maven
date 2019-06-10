<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<c:import url="navbar.jsp"/>

 <div id="wrapper">

    <!-- Sidebar -->
    <ul class="sidebar navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="home">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Home</span>
        </a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          <i class="fas fa-fw fa-folder"></i>
          <span>Administrativo</span>
        </a>
        
        <div class="dropdown-menu" aria-labelledby="pagesDropdown">
          <h6 class="dropdown-header">Cadastro de Clientes</h6>
          <a class="dropdown-item" href="cadastraClienteForm">Cadastrar</a>
          <a class="dropdown-item" href="listaCliente">Pesqusiar</a>
         
          <div class="dropdown-divider"></div>
          <h6 class="dropdown-header">Cadastro de Produtos</h6>
           <a class="dropdown-item" href="cadastraProduto.jsp">Cadastrar</a>
          <a class="dropdown-item" href="#">Pesqusiar</a>
          
            <div class="dropdown-divider"></div>
          <h6 class="dropdown-header">Cadastro de Funcionários</h6>
           <a class="dropdown-item" href="#">Cadastrar</a>
          <a class="dropdown-item" href="#">Pesqusiar</a>
        </div>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="charts.html">
          <i class="fas fa-fw fa-chart-area"></i>
          <span>Relatórios</span></a>
      </li>
      
      <li class="nav-item dropdown">
       <a class="nav-link dropdown-toggle" href="#" id="pagesDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          <i class="fas fa-fw fa-table"></i>
          <span>Vendas</span>
        </a>
         <div class="dropdown-menu" aria-labelledby="pagesDropdown">
          <h6 class="dropdown-header">Consultar vendas</h6>
          <a class="dropdown-item" href="#">Pesquisar</a>
        </div>
     </li>
    </ul>