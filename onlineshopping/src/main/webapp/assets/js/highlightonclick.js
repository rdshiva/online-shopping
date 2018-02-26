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
	default:
		if(menu == "Home") 
		break;
		$('#listofproduct').addClass('active');
		$('#a_' + menu).addClass('active');
		break;

	}

});