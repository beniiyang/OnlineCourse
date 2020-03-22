<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<script type="text/javascript">
        function refresh() {
            document.getElementById('captcha_img').src="/kaptcha?"+Math.random();
        }
 </script>
<body>
    <h2>Login</h2>
    <form action="/login"  method="post">
        <table>
            <tr>
                <td>UserName: š</td>
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
                <td ><button type="submit">Submit</button></td>
                	<td ><button type="button">Reset</button></td>
            </tr>
        </table>
    </form>
    
    <form action="/hello" method="post">
	    
    
   
</form>
</body>
</html>
