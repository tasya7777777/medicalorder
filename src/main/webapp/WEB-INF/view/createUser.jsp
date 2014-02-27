<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div>
	<h2>Create a free User account</h2>
	<sf:form method="POST" modelAttribute="user">
		<fieldset>
			<table>
				<tr>
					<th><label for="user_first_name">first name:</label></th>
					<td><sf:input path="firstName" size="15" id="user_first_name" /></td>
				</tr>
				<tr>
					<th><label for="user_last_name">last name:</label></th>
					<td><sf:input path="lastName" size="15" id="user_last_name" /></td>
				</tr>
				<tr>
					<th><label for="user_screen_name">username:</label></th>
					<td><sf:input path="username" size="15" maxlength="15"
							id="user_screen_name" /> <small id="username_msg">No
							spaces, please.</small></td>
				</tr>
				<tr>
					<th><label for="user_password">password:</label></th>
					<td><sf:password path="password" size="30" showPassword="true"
							id="user_password" /> <small>6 characters or more (be
							tricky!)</small></td>
				</tr>
				<tr>
					<th><label for="user_telephone">telephone:</label></th>
					<td><sf:input path="telephone" size="30" id="user_telephone" />
						<small>In case you forget something</small></td>
				</tr>
				<tr>
					<th><label for="user_email">email:</label></th>
					<td><sf:input path="email" size="30" id="user_email" /> <small>In
							case you forget something</small></td>
				</tr>
			</table>
		</fieldset>
		<input type="submit" value="Submit" />
	</sf:form>
</div>
