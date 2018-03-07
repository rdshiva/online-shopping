$(function() {
	// solving the active menu
	switch (menu) {

	case 'About':
		$('#about').addClass('active');
		break;
	case 'Contact':
		$('#contact').addClass('active');
		break;
	case 'All Products':
		$('#listofproduct').addClass('active');
		break;
	case 'Manage Products':
		$('#manageProducts').addClass('active');
		break;
	default:
		if(menu == "Home") 
		break;
		$('#listofproduct').addClass('active');
		$('#a_' + menu).addClass('active');
		break;

	}
	
	//code for jquery data table
	//create a dataset

	
	var $table = $('#productlistTable');
		
	//execute the belwo code only when we have this table
	if(!$table.lenght){
		
		var jsonUrl = '';
		
		if(window.categoryId == ''){
			jsonUrl = window.contextRoot + '/json/data/all/products';
		}else{
			jsonUrl = window.contextRoot + '/json/data/category/'+ window.categoryId +'/products';
			
		}
		
		console.log('inside the if - table');
				
		$table.DataTable({
			lengthMenu: [[3,5,10,-1],['3 Records', '5 Records','10 Records','All']],
			pageLength: 5,
			ajax: {
				url: jsonUrl,
				dataSrc: ''				
			},
			columns: [
				{
					data: 'name' 
				},
				{
					data: 'brand' 
				},
				{
					data: 'unitPrice',
					mRender: function(data, type, row){
						return '&#8377; ' + data;
					}
				},
				{
					data: 'quantity' 
				},
				{
					data: 'id',
					mRender: function(data, type,row){
						
						var str = '';
						str += '<a href ="'+window.contextRoot+ '/show/'+data+'/prodcut" > View </a>';
						str += '<a href ="'+window.contextRoot+ '/cart/add/'+data+'/product">Add to Cart</a>';
						
						return  str;
						
					}
					
				}
				
				
				
			]
		});
	}
	
	//dismissing the alert after 3 secon
	
	var $alert = $('.alert');
	if($alert.length){
		setTimeout(function(){
			$alert.fadeOut('slow')
		},3000)
	}
	
	
	
});