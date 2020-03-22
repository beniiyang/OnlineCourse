<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
   	<script type="text/javascript">
        function refresh() {
            document.getElementById('captcha_img').src="/kaptcha?"+Math.random();
        }
 	</script>
</head>
<body>
    <h2>Register</h2>
    <form action="/register"  method="post">
        <table>
        	<tr>
                <td>Name: </td>
                <td><input type="text" name="name"></td>
            </tr>
            	<tr>
                <td>Email: </td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>UserName: </td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>Password: </td>
                <td><input type="password" name="password"></td>
            </tr>
            	<tr>
	            	<td>
		        <img id="captcha_img" alt="click change" title="click change"
		             onclick="refresh()" src="/kaptcha" />
		    		</td>
				<td><input type="text" placeholder="Enter Captcha" name="verifyCodeActual"></td>
			</tr>
            <tr>
                <td ><button type="submit">Register</button></td>
                	<td ><button type="button">Reset</button></td>
            </tr>
        </table>
    </form>
</body>
</html>
