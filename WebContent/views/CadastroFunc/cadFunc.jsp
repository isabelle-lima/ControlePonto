<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Cadastro de Funcionário | Controle Ponto</title>

    <!-- Bootstrap core CSS-->
    <link href="../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template-->
    <link href="../vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template-->
    <link href="../css/sb-admin.css" rel="stylesheet">

</head>
<body class="bg-dark">
	<div class="container">
      <div class="card card-register mx-auto mt-5">
        <div class="card-header">Registro de Funcionário</div>
        <div class="card-body">
          <form>
            <div class="form-group">
              <div class="form-row">
                <div class="col-md-12">
                  <div class="form-label-group">
                    <input type="text" id="txtFullname" class="form-control" placeholder="Full Name" required="required" autofocus="autofocus">
                    <label for="txtFullname">Nome completo</label>
                  </div>
                </div>
              </div>
            </div>
            <div class="form-group">
            	<div class="form-row">
            		<div class="col-md-12">
                  		<div class="form-label-group">
                    		<input type="text" id="txtAddress" class="form-control" placeholder="Endereço" required="required">
                    		<label for="txtAddress">Endereço</label>
                  		</div>
                	</div>
            	</div>
            </div>
            <div class="form-group">
            	<div class="form-row">
            		<div class="col-md-4">
                  		<div class="form-label-group">
                    		<input type="text" id="txtCep" class="form-control" placeholder="CEP" required="required">
                    		<label for="txtCep">CEP</label>
                  		</div>
                	</div>
                	<div class="col-md-4">
                  		<div class="form-label-group">
                    		<input type="text" id="txtCidade" class="form-control" placeholder="Cidade" required="required">
                    		<label for="txtCidade">Cidade</label>
                  		</div>
                	</div>
                	<div class="col-md-4">
                  		<div class="form-label-group">
                    		<input type="text" id="txtUF" class="form-control" placeholder="UF" required="required">
                    		<label for="txtUF">UF</label>
                  		</div>
                	</div>
            	</div>
            </div>
            <div class="form-group">
              <div class="form-label-group">
                <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required="required">
                <label for="inputEmail">Email address</label>
              </div>
            </div>
            <div class="form-group">
              <div class="form-row">
                <div class="col-md-6">
                  <div class="form-label-group">
                    <input type="text" id="txtTelefoneResid" class="form-control" placeholder="Telefone residencial">
                    <label for="txtTelefoneResid">Telefone Residencial</label>
                  </div>
                </div>
                <div class="col-md-6">
                  <div class="form-label-group">
                    <input type="text" id="txtCelular" class="form-control" placeholder="Celular" required="required">
                    <label for="txtCelular">Celular</label>
                  </div>
                </div>
              </div>
            </div>
            <input class="btn btn-primary btn-block" type="submit" value="Registrar funcionário">
          </form>
          <!--
          <a class="btn btn-primary btn-block" href="login.html">Register</a>
          <div class="text-center">
            <a class="d-block small mt-3" href="login.html">Login Page</a>
            <a class="d-block small" href="forgot-password.html">Forgot Password?</a>
          </div>
           -->
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="../vendor/jquery/jquery.min.js"></script>
    <script src="../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="../vendor/jquery-easing/jquery.easing.min.js"></script>
	
</body>
</html>