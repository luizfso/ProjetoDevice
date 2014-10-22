<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="initializr/favicon.ico">
	
	<title>Project PET Device - Menu Cliente</title>

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
    <link href="initializr/css/navbar.css" rel="stylesheet">

  </head>

  <body>
    <div class="container">
      <!-- Static navbar -->
      <div class="navbar navbar-default" role="navigation">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Project PET Device - Area do Cliente</a>
          </div>
          <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
           <li class="active"><a href="./home.jsp">Home</a></li>
              <li><a href="./about.jsp">Sobre</a></li>
              <li><a href="./contato.jsp">Contato</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Mais + <span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                   <li><a href="./galeria.html">Galeria de Imagens</a></li>
                   <li class="divider"></li>
                   <li class="dropdown-header">Area Restrita</li>
                   <li><a href="./login.html">Login do Administrador</a></li>
                </ul>
              </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
              <li class="active"><a href="#">Area restrita</a></li>
              <li><a href="./home.jsp">Log Out</a></li>
              <!-- <li><a href="../navbar-fixed-top/">Fixed top</a></li> -->
            </ul>
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </div>

      <!-- Main component for a primary marketing message or call to action -->
      <div class="jumbotron">
		<h1>Menu Investidores</h1>
			<p><a class="btn btn-primary" role="button" href="listarInvestidores?id=${investidoress.id}"><span class="glyphicon glyphicon-arrow-right"></span> Listar todos</a> </p>
			<p><a class="btn btn-primary" role="button" href="procurarInvestidores.html"><span class="glyphicon glyphicon-arrow-right"></span> Procurar</a> </p>
			<p><a class="btn btn-primary" role="button" href="menu.html"><span class="glyphicon glyphicon-arrow-left"></span> Voltar ao menu</a> </p>
	</div>

 <!-- Marketing messaging and featurettes
 ================================================== -->
 <!-- Wrap the rest of the page in another container to center all the content. -->
	<!-- 
    <div class="container marketing">
      <div class="row">
        <div class="col-lg-4">
          <img class="img-circle" src="./initializr/img/about140x140-01.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>Sobre o Device Pet</h2>
          <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>
          <p><a class="btn btn-default" href="About.jsp" role="button">Ver mais &raquo;</a></p>
        </div>
        <div class="col-lg-4">
          <img class="img-circle" src="./initializr/img/contact140x140-01.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>Entre em Contato</h2>
          <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh.</p>
          <p><a class="btn btn-default" href="#" role="button">Ver mais &raquo;</a></p>
        </div>
        <div class="col-lg-4">
          <img class="img-circle" src="./initializr/img/Mixed_Pets.jpg" alt="Generic placeholder image" style="width: 140px; height: 140px;">
          <h2>Galeria de Imagens</h2>
          <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
          <p><a class="btn btn-default" href="#" role="button">Ver mais &raquo;</a></p>
        </div>
      </div> -->
      
 </div> <!-- /container -->
<!-- FOOTER -->
      <footer>
        <p>&copy; 2014 SalvePet, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
      </footer>


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

      


    