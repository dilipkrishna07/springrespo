<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body{
            background-color: coral;
        }
        .parent{
            
            background-color: white;
            width: 450px;
            height: 420px;
            margin: auto auto;
            display: flex;
            justify-content: center;
            position: relative;
            top: 25px;
            border-radius: 20px;
            box-shadow: 5px 10px 18px  #0c0c0c;
            
        }
        h1{
            
           position: relative;
           top:40px; 
           font-weight: bold;
        
        }
        input{
            border: none;
            border-bottom: 1px solid black;
        }
        .email input,.name input,.mobile input{
            border-radius: 4px;
            
        }
        .email,.name,.mobile,.dob,.location,.file,.button{
            padding: 12px;
            margin-top: 10px;
        }
        .button{
            display: flex;
            justify-content: center; 
            
        }
        .button button{
            width: 100px;
            height: 40px;
            background-color: blue;
            color: aliceblue;
            border-radius: 10px;
            
        }
        .name input{
            margin-left: 29px;
        }
        .email input{
            margin-left: 29px;
        }
        .dob input{
            margin-left: 42px;
        }
        .file input{

            margin-left: 22px;
            width: 50%;
        }
        button:hover{
            background-color: red;
            border: 3px solid hotpink;
            
        }

        .msg{
            display: flex;
            justify-content: center;
        }

    </style>
</head>
<body>
    <h1 align="center" >User Registration</h1>
    <section class="parent">
        <form action="Validation">
            <div class="name">
                <label for="">Name:</label>
                <input required type="text" placeholder="name" name="name">
            </div>

            <div class="email">
                <label for="">Email:</label>
                <input required type="email" placeholder="enter email" name="email">
            </div>

            <div class="mobile">
                <label for="">Mobile no:</label>
                <input required type="tel" placeholder="mobile number" name="mobile" minlength="10" maxlength="10">
            </div>

            <div class="location">
                <label for="">Add location: </label>
                <select name="location" id="" required>
                    <option value="Any Location">Any Location</option>
                    <option value="Bangalore">Bangalore</option>
                    <option value="Hyderabad">Hyderabad</option>
                    <option value="Chennai">Chennai</option>
                    <option value="New Delhi">New Delhi</option>
                </select>

            </div>
            <div class="dob">
                <label for="">DOB:</label>
                <input type="date" required name="date">
            </div>
            <div class="file">
                <label for="">Add file:</label>
                <input type="file" accept=".pdf,.png" name="doc">
            </div>
            <div class="button">
                <button type="submit">Signup</button>
            </div>
        </form>
    </section>
    <h1 class="msg">${msg}</h1>
</body>
</html>