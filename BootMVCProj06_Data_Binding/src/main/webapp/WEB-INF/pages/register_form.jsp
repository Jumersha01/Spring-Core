<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>

<style type="text/css">
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Segoe UI', sans-serif;
}

body {
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    background: linear-gradient(-45deg, #4facfe, #00f2fe, #43e97b, #38f9d7);
    background-size: 400% 400%;
    animation: bgAnimation 12s ease infinite;
}

@keyframes bgAnimation {
    0% {
        background-position: 0% 50%;
    }
    50% {
        background-position: 100% 50%;
    }
    100% {
        background-position: 0% 50%;
    }
}

.container {
    width: 560px;
    background: rgba(255, 255, 255, 0.18);
    backdrop-filter: blur(18px);
    border-radius: 20px;
    padding: 35px;
    box-shadow: 0 15px 35px rgba(0, 0, 0, 0.25);
    border: 1px solid rgba(255, 255, 255, 0.35);
    animation: zoomIn 0.9s ease;
}

@keyframes zoomIn {
    from {
        opacity: 0;
        transform: scale(0.7);
    }

    to {
        opacity: 1;
        transform: scale(1);
    }
}

h2 {
    text-align: center;
    color: white;
    margin-bottom: 30px;
    font-size: 30px;
    letter-spacing: 1px;
    animation: glow 2s infinite alternate;
}

@keyframes glow {
    from {
        text-shadow: 0 0 8px white;
    }

    to {
        text-shadow: 0 0 20px cyan;
    }
}

table {
    width: 100%;
    border-collapse: collapse;
}

th {
    text-align: left;
    color: white;
    padding: 15px;
    font-size: 16px;
    width: 40%;
}

td {
    padding: 15px;
}

input[type="text"] {
    width: 100%;
    padding: 12px;
    border: none;
    border-radius: 10px;
    outline: none;
    font-size: 15px;
    transition: 0.4s;
}

input[type="text"]:focus {
    transform: scale(1.04);
    box-shadow: 0 0 15px cyan;
}

.btn {
    width: 100%;
    padding: 13px;
    border: none;
    border-radius: 10px;
    background: #0F172A;
    color: white;
    font-size: 17px;
    font-weight: bold;
    cursor: pointer;
    transition: 0.4s;
}

.btn:hover {
    background: #1D4ED8;
    transform: translateY(-4px) scale(1.03);
    box-shadow: 0 10px 25px rgba(0, 0, 0, 0.35);
}

.btn:active {
    transform: scale(0.95);
}

tr {
    opacity: 0;
    animation: slideUp 0.8s forwards;
}

tr:nth-child(1) {
    animation-delay: 0.2s;
}

tr:nth-child(2) {
    animation-delay: 0.4s;
}

tr:nth-child(3) {
    animation-delay: 0.6s;
}

tr:nth-child(4) {
    animation-delay: 0.8s;
}

tr:nth-child(5) {
    animation-delay: 1s;
}

tr:nth-child(6) {
    animation-delay: 1.2s;
}

@keyframes slideUp {
    from {
        opacity: 0;
        transform: translateY(30px);
    }

    to {
        opacity: 1;
        transform: translateY(0);
    }
}
</style>
</head>


<body>

	<div class="container">

		<h2>Student Registration</h2>

		<form:form action="save" method="post" modelAttribute="add">

			<table>

				<tr>
					<th>Student ID</th>
					<td><form:input path="id" placeholder="Enter Student ID" /></td>
				</tr>

				<tr>
					<th>Student Name</th>
					<td><form:input path="name" placeholder="Enter Student Name" />
					</td>
				</tr>

				<tr>
					<th>College</th>
					<td><form:input path="college"
							placeholder="Enter College Name" /></td>
				</tr>

				<tr>
					<th>Class</th>
					<td><form:input path="cls" placeholder="Enter Class" /></td>
				</tr>

				<tr>
					<th>Address</th>
					<td><form:input path="add" placeholder="Enter Address" /></td>
				</tr>

				<tr>
					<td colspan="2"><input type="submit" value="Register Student"
						class="btn"></td>
				</tr>

			</table>

		</form:form>

	</div>

</body>
</html>