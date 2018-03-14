<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="container">

	<div class="row">

		<!-- message display -->
		<c:if test="${not empty message}">
			<div class="col-xs-12">
				<div class="alert alert-success alert-dismissible">
					<button type="button" class="close" data-dismiss="alert">&times;</button>
					${message}

				</div>

			</div>
		</c:if>

		<div class="col-md-offset-2 col-md-8">

			<div class="panel panel-primary">

				<div class="panel-heading">

					<h4>Product Management</h4>

				</div>

				<div class="panel-body">

					<!-- form elements -->

					<sf:form class="form-horizontal" modelAttribute="product"
						action="${contextRoot }/manage/products" method="POST"
						enctype="multipart/form-data">

						<div class="form-group">
							<label class="control-label col-md-4" for="name">Enter
								Product Name:</label>
							<div class="col-md-8">
								<sf:input type="text" path="name" id="name"
									placeholder="Product Name" class="form-control"></sf:input>
								<sf:errors path="name" cssClass="help-block" element="em"></sf:errors>

							</div>

						</div>



						<div class="form-group">
							<label class="control-label col-md-4" for="brand">Enter
								Brand Name:</label>
							<div class="col-md-8">
								<sf:input type="text" path="brand" id="brand"
									placeholder="Brand Name" class="form-control"></sf:input>
								<sf:errors path="brand" cssClass="help-block" element="em"></sf:errors>

							</div>

						</div>

						<div class="form-group">
							<label class="control-label col-md-4" for="decription">Product
								Description:</label>
							<div class="col-md-8">
								<sf:textarea rows="4" cols="70" path="description"
									id="description" placeholder="Write a Description"></sf:textarea>
								<sf:errors path="description" cssClass="help-block" element="em"></sf:errors>

							</div>

						</div>

						<div class="form-group">
							<label class="control-label col-md-4" for="unitPrice">Unit
								Price:</label>
							<div class="col-md-8">
								<sf:input type="number" path="unitPrice" id="unitPrice"
									placeholder="Unit Price in &#8377" class="form-control"></sf:input>
								<sf:errors path="unitPrice" cssClass="help-block" element="em"></sf:errors>

							</div>

						</div>

						<div class="form-group">
							<label class="control-label col-md-4" for="quantity">Quantity
								Available:</label>
							<div class="col-md-8">
								<sf:input type="number" path="quantity" id="quantity"
									placeholder="Quantity Available" class="form-control"></sf:input>

							</div>

						</div>
						<!-- file upload multipart using enctype -->
						<div class="form-group">
							<label class="control-label col-md-4" for="file">File Upload:</label>
							<div class="col-md-8">
								<sf:input type="file" path="file" id="file"
									placeholder="file" class="form-control"></sf:input>
								<sf:errors path="file" cssClass="help-block" element="em"></sf:errors>

							</div>

						</div>
						<div class="form-group">

							<label class="control-label col-md-4" for="categoryId">Select
								Category:</label>
							<div class="col-md-8">
								<sf:select class="form-control" id="categoryId"
									path="categoryId" items="${categories}" itemLabel="name"
									itemValue="id">

								</sf:select>
							</div>

						</div>

						<div class="form-group">

							<div class="col-md-offset-4 col-md-8">
								<input type="submit" name="submit" id="submit"
									placeholder="Submit" class="btn btn-primary"></input>
							</div>

						</div>
						<!-- hidden fields -->
						<sf:hidden path="id" />
						<sf:hidden path="code" />
						<sf:hidden path="supplierId" />
						<sf:hidden path="purchases" />
						<sf:hidden path="views" />
						<sf:hidden path="active" />


					</sf:form>


				</div>

			</div>

		</div>

	</div>

</div>