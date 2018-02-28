<div class="container">

	<div class="row">

		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>

		<div class="col-md-9">
			<div class="row">
				<div class="col-lg-12">

					<c:if test="${userClickAllProducts == true }">
						<script>
							window.categoryId = '';
						</script>


						<ol class="breadcrumb">
							<li><a href="${contextRoot }/home">Home</a></li>
							<li class="acitve">All Products</li>
						</ol>
					</c:if>

					<c:if test="${userClickCategoryProducts == true }">
						<script>
							window.categoryId = '${category.id}';
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextRoot }/home">Home</a></li>
							<li class="acitve">Category</li>
							<li class="acitve">${category.name }</li>
						</ol>
					</c:if>

				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-xs-12">
				<table id="productlistTable"
					class="table table-striped table-borderd">
					<thead>
						<tr>

							<th>Name</th>
							<th>Brand</th>
							<th>Price</th>
							<th>Qty.Available</th>
							<th></th>
							
						</tr>

					</thead>
				</table>
			</div>
		</div>
	</div>
</div>