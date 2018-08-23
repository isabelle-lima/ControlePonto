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

    <title>Cadastro de usu�rio | Controle de Ponto</title>

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
        <div class="card-header">Cadastro de usu�rio</div>
        <div class="card-body">
          <form>
          	<div class="form-group">
            	<div class="form-row">
            		<div class="col-md-6">
            			<div class="form-label-group">
            				<input type="text" id="txtFunc" class="form-control" placeholder="Funcionario" required="required">
            				<label for="txtFunc">Nome do Funcion�rio</label>
            			</div>
            		</div>
            		<div class="col-md-6">
            			<div class="form-label-group">
            				<input type="text" id="txtCargoFunc" class="form-control" placeholder="Cargo" required="required">
            				<label for="txtCargoFunc">Cargo</label>
            			</div>
            		</div>
            	</div>
            </div>
            <div class="form-group">
              <div class="form-row">
                <div class="col-md-6">
                  <div class="form-label-group">
                    <input type="text" id="txtUser" class="form-control" placeholder="Username" required="required" autofocus="autofocus">
                    <label for="txtUser">Username</label>
                  </div>
                </div>
            	</div>
            </div>
            <div class="form-group">
            	<div class="form-row">
            		<div class="col-md-6">
                  <div class="form-label-group">
                    <input type="password" id="txtPwd" class="form-control" placeholder="Password" required="required">
                    <label for="txtPwd">Password</label>
                  </div>
                </div>
                <div class="col-md-6">
                  <div class="form-label-group">
                    <input type="password" id="txtCPwd" class="form-control" placeholder="Confirm password" required="required">
                    <label for="txtCPwd">Confirm password</label>
                  </div>
                </div>
            	</div>
            </div>
            <input class="btn btn-primary btn-block" type="submit" value="Cadastrar usu�rio">
            <!--
            <a class="btn btn-primary btn-block" href="login.html">Register</a>
             -->
          </form>
          <!--
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