<%@ include file = "common/header.jspf"%>
<%@ include file = "common/navbar.jspf" %>
			<h1>Add Todo</h1>
			
			<form:form method = "POST" modelAttribute="todo">
				<fieldset class = "mb-3">
					<form:label path="description">Description</form:label>
					<form:input type = "text" path = "description" required="required"/>
					<form:errors class = "text-warning" path = "description"/>
				</fieldset>
				
				<fieldset class = "mb-3">
					<form:label path="targetDate">Target Date</form:label>
					<form:input type = "text" path = "targetDate" required="required"/>
					<form:errors class = "text-warning" path = "targetDate"/>
				</fieldset>
				
				
				<form:input type = "hidden" path = "id"/>
				<form:input type = "hidden" path = "done"/>
				<input type= "submit" class = "btn btn-primary">
			</form:form>
			
			
<%@ include file = "common/footer.jspf"%>
<script src = "webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript">
		$('#targetDate').datepicker({
		    format: 'yyyy-mm-dd',
		});
		</script>