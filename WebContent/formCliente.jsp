<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="initializr/favicon.ico">

    <title>Project PET Device - Cadastro Cliente</title>

    <!-- Bootstrap core CSS -->
    <link href="initializr/css/bootstrap.min.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="initializr/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Custom styles for this template -->
    <link href="initializr/css/main.css" rel="stylesheet"></link>
<style id="holderjs-style" type="text/css"></style>
<script type="text/javascript">
$('.dropdown-toggle').dropdown()
  </script>
  </head>
<!-- NAVBAR
================================================== -->
  <body>
    <div class="navbar-wrapper">
      <div class="container">

        <div class="navbar navbar-inverse navbar-static-top" role="navigation">
          <div class="container">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="navbar-brand" href="#">Project PET Device</a>
            </div>
            <div class="navbar-collapse collapse">
              <ul class="nav navbar-nav">
                <li><a href="./home.jsp">Home</a></li>
                <li><a href="About.jsp">About</a></li>
                <li><a href="#contact">Contact</a></li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-info-sign"></span> Mais</a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="#">Galeria de Imagens</a></li>
                    <li class="divider"></li>
                    <li class="dropdown-header">Area Restrita</li>
                    <li><a href="./login.html">Login do Administrador</a></li>
                  </ul>
                </li>
              </ul>
            </div>
          </div>
        </div>

      </div>
    </div>

    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->
<hr class="featurette-divider">
<div class="container marketing">
	<div class="jumbotron">

		<form class="form-horizontal" role="form" action="salvarCliente?id=${cliente.id}" method="post">
		<h2 class="form-cadastro-heading">Dados Cadastrais Para Cliente</h2>
		
		<div class="form-group">
    		<label for="inputName" class="col-sm-2 control-label">Nome</label>
    			<div class="col-sm-10">
     			 <input type="text" class="form-control" name="txtNome" id="inputName" placeholder="Nome Completo" value="${cliente.nome}"/>
    			</div>
  		</div>
		
		<div class="form-group">
    		<label for="inputEmail3" class="col-sm-2 control-label">Email</label>
    			<div class="col-sm-10">
     			 <input type="email" class="form-control" name="txtEmail" id="inputEmail" placeholder="Email de Contato" value="${cliente.email}">
    			</div>
  		</div>
  		
  		<div class="form-group">
    		<label for="inputName" class="col-sm-2 control-label">Telefone</label>
    			<div class="col-sm-10">
     			 <input type="text" class="form-control" name="txtTelefone" id="inputTelefone" placeholder="Telefone" value="${cliente.telefone}"/>
    			</div>
  		</div>
  		
  		
       <div class="form-group">
    		
		<a class="btn btn-primary" href="./home.jsp" role="button"><span class="glyphicon glyphicon-arrow-left"></span> Voltar</a>&nbsp;&nbsp;
		<button class="btn btn-success" type="submit" value="Salvar" name="btnSalvar"><span class="glyphicon glyphicon-floppy-save"></span> Salvar</button>
  		</div>
    	
    	
		</form>
	</div>

      <!-- Three columns of text below the carousel -->
      <div class="row">
        <div class="col-lg-4">
          <img class="img-circle" src="./initializr/img/about140x140-01.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>Sobre o Device Pet</h2>
          <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>
          <p><a class="btn btn-default" href="about.jsp" role="button">Ver mais <span class="glyphicon glyphicon-eye-open"></span></a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="./initializr/img/contact140x140-01.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>Entre em Contato</h2>
          <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh.</p>
          <p><a class="btn btn-default" href="contato.jsp" role="button">Ver mais <span class="glyphicon glyphicon-eye-open"></span></a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="./initializr/img/contato300x258-01.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>Galeria de Imagens</h2>
          <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
          <p><a class="btn btn-default" href="galeria.html" role="button">Ver mais <span class="glyphicon glyphicon-eye-open"></span></a></p>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->

      <hr class="featurette-divider">

      <!-- FOOTER -->
      <footer>
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>&copy; 2014 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
      </footer>
</div>


    
    <!-- /.container -->

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="initializr/js/bootstrap.min.js"></script>
    <script src="initializr/js/docs.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="initializr/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
