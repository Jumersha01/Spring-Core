<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Registration</title>

<style>
    body{
        font-family: Arial, sans-serif;
        background:#f4f4f4;
    }

    .container{
        width:400px;
        margin:60px auto;
        background:white;
        padding:25px;
        border-radius:10px;
        box-shadow:0px 0px 10px gray;
    }

    h2{
        text-align:center;
        color:#0066cc;
    }

    table{
        width:100%;
    }

    td{
        padding:10px;
    }

    input[type=text],
    input[type=number]{
        width:100%;
        padding:8px;
        border:1px solid gray;
        border-radius:5px;
    }

    input[type=submit],
    input[type=reset]{
        padding:10px 20px;
        border:none;
        border-radius:5px;
        cursor:pointer;
        font-weight:bold;
    }

    input[type=submit]{
        background:green;
        color:white;
    }

    input[type=reset]{
        background:red;
        color:white;
    }
</style>

</head>
<body>

<div class="container">

<h2>Product Registration Form</h2>

<form action="saveProduct" method="post">

<table>
<tr>
    <td>Product Name</td>
    <td>
        <input type="text" name="name">
    </td>
</tr>

<tr>
    <td>Price</td>
    <td>
        <input type="number" step="0.01" name="price">
    </td>
</tr>

<tr>
    <td colspan="2" align="center">
        <input type="submit" value="Save Product">
        <input type="reset" value="Reset">
    </td>
</tr>

</table>

</form>

</div>
<h2 style="text-align:center;color:red;">${msg}</h2>
<h2 style="text-align:center;color:red;">
<a href="retrive" style="text-decoration:none;">
 Retrive Data
</a>
</h2>

</body>
</html>