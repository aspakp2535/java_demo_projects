<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css">
    <style>
        /* Form container */
    .form-container {
      text-align:center;
      max-width: 300px;
      margin: auto;
    }
    
    /* Form input fields */
    .form-input {
      width: 100%;
      padding: 10px;
      margin-bottom: 15px;
      border: 1px solid #ccc;
      border-radius: 4px;
    }
    input{
        text-align: center;
        margin-left: -30px; 
		cursor: pointer;
    }
    
    
    /* Submit button */
    .form-submit {
      background-color: #4CAF50;
      color: white;
      padding: 10px 20px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }
    
    /* Submit button hover effect */
    .form-submit:hover {
      background-color: #45a049;
    }
        
    </style>
    <body>
        <form method="post" action="hello" autocomplete="off" class="form-container">
        	<h1>Login</h1>
            
            <input class="form-input" type="text" name="name" autofocus="" autocapitalize="none" autocomplete="username" placeholder="Username" id="id_username">
            
            <input class="form-input" type="password" name="pass" autocomplete="current-password" placeholder="Password" required="" id="id_password">
            <i class="far fa-eye" id="togglePassword" style="margin-left: -30px; cursor: pointer;"></i>
            <button class="form-submit" type="submit" class="btn btn-primary">Login</button>
          </form>
    </body>
    <script>
        const togglePassword = document.querySelector('#togglePassword');
  const password = document.querySelector('#id_password');

  togglePassword.addEventListener('click', function (e) {
    // toggle the type attribute
    const type = password.getAttribute('type') === 'password' ? 'text' : 'password';
    password.setAttribute('type', type);
    // toggle the eye slash icon
    this.classList.toggle('fa-eye-slash');
});
    </script>
</html>