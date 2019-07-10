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
<body  style="background-image: url(images/view.jpg);" >
    
     

    <div class="main">
      

        <div class="container">
            <div class="booking-content">
                <div class="booking-image">
                    <img class="booking-img" src="images/about-2.jpg" alt="Booking Image">
                </div>
                <div class="booking-form">
                    <form id="booking-form" method="POST" action="register">
                        <h2>Hotel Registration</h2>
                        <div class="form-group form-input">
                            <input type="text" name="Name" id="name" value="" required/>
                            <label for="Name" class="form-label">Company Name</label>
                        </div>
                        <div class="form-group form-input">
                            <input type="Text" name="Location" id="phone" value="" required />
                            <label for="Location" class="form-label">Location</label>
                        </div>
                        <div class="form-group form-input">
                            <input type="number" name="Tele" id="phone" value="" required />
                            <label for="Tele" class="form-label">Contact Number</label>
                        </div>
                        <div class="form-group form-input">
                            <input type="text" name="Owner" id="phone" value="" required />
                            <label for="Owner" class="form-label">Owner's Name</label>
                        </div>
                        <div class="form-group form-input">
                            <input type="text" name="Email" id="phone" value="" required />
                            <label for="Email" class="form-label">Email</label>
                        </div>
                        
                        
                        

                        <div class="form-submit">
                            <input type="submit" value="Register" class="submit" id="submit" name="submit" />
                            <h3>OR</h3>
                            <h5 style='color:#9971E1'>Alredy Have An Account</h5>
                            <a href="login.jsp" class="vertify-booking">Sign In</a>
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