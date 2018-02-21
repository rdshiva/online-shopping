<div class="container">

	<div class="row">

		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp" %>
		</div>

		<div class="col-md-9">
			<div class="row">
				<div class="col-lg-12">

					<c:if test="${userClickAllProducts == true }">
						<ol class="breadcrumb">
							<li><a href="${contextRoot }/home">Home</a></li>
							<li class="acitve">All Products</li>
					</ol>
					</c:if>
					
					<c:if test="${userClickCategoryProducts == true }">

						<ol class="breadcrumb">
							<li><a href="${contextRoot }/home">Home</a></li>
							<li class ="acitve">Category</li>
							<li class ="acitve">${category.name }</li>
					</ol>
					</c:if>
					
				</div>
			</div>
		</div>
		
		
	</div>
</div>