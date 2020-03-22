<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Account Update Page</title>
</head>
<body>
    <h2>Account Update</h2>
    <form action="/update"  method="post">
        <table>
        	<tr>
                <td>Nameï¼š</td>
                <td><input type="text" name="name"></td>
            </tr>
            	<tr>
                <td>Email: </td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>UserName: š</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>Password: </td>
                <td><input type="password" name="password"></td>
            </tr>
            	<tr>
                <td>Re-Enter Password: </td>
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
                <td colspan="2"><button type="submit">Update</button></td>
            </tr>
        </table>
    </form>
</body>
</html>
