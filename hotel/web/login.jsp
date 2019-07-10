<%-- 
    Document   : booking
    Created on : Jun 8, 2019, 7:45:41 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up Form by Colorlib</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="css/style2.css">
     
</head>
<body   style="background-image: url(images/back.jpg); background-repeat:no-repeat; height:100%; width:100%;">

    <div class="main">

        <div  style="background: #000;"class="container">
            <div class="booking-content">
                <div class="booking-image">
                    <img class="booking-img" src="images/view.jpg" alt="Booking Image">
                </div>
                <div class="booking-form">
                    <form  method="POST" action="login">
                        <h2>Sign In</h2>
                        <div class="form-group form-input">
                            <input type="text" name="Usname" value="" required/>
                            <label for="Name" class="form-label">User Name</label>
                        </div>
                        <div class="form-group form-input">
                            <input type="password" name="Password" value="" required />
                            <label for="Password" class="form-label">Password</label>
                        </div>
                        
                        
                        
                        

                        <div class="form-submit">
                            <input type="submit" value="Sign In" class="submit" id="submit" name="submit" />
                            <h3>OR</h3>
                            <h5 style='color:#9971E1'>New Member?</h5>
                            <a href="booking.jsp" class="vertify-booking">Sign UP</a>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>

    <!-- JS -->
    <script src="vendor/jquery/jquery.min2.js"></script>
    <script src="js/main2.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>