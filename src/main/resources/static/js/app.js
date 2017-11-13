$(document).ready(function() {
	
	$.ajax( "/countries" )
	  .done(function(data) {
	    let countryTableRows = data.map((country, index) => {
	    	let countryCurrencies = country.currencies.map((currency, index) => currency.name);
	    	return `<tr><td>${country.name}</td><td>${countryCurrencies.join()}</td></tr>`
	    });
	    $("#countriesTable tbody").append(countryTableRows)
	    $('#countriesTable').DataTable({
	    	  "pageLength": 5
	    });
	  })
	  .fail(function() {
	    alert( "error" );
	  })
	  .always(function() {
	  });
});