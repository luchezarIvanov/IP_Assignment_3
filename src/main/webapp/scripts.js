$(document).on('ready', getData);

// Sends a GET request to the web server and populates the table
function getData() {
	$.ajax({
		url: "http://localhost:8080/rest/api/planes",
		type: "GET",
		dataType: "json",
		success: function(data) {
			console.log(data);
			
			$.each(data, function(index){
				var tr = $('<tr>');
				tr.append('<td>' + data[index].model + '</td>');
				tr.append('<td>' + data[index].engine + '</td>');
				tr.append('<td>' + data[index].seats + '</td>');
				tr.append('<td>' + data[index].maxWeight + '</td>');
				tr.append('<td>' + data[index].maxBaggage + '</td>');
				tr.append('<td>' + data[index].maxSpeed + '</td>');
				tr.append('</tr>');
				$('#planes').append(tr);
			});
		}
	});
}

$('#add').on('click', function () {
	var data = $('#form').serializeArray().reduce(function (data, prop) {
		data[prop.name] = prop.value;
		return data;
	}, {});

	$.post({
		contentType: 'application/json',
		url: 'http://localhost:8080/rest/api/planes',
		dataType: "json",
		data: JSON.stringify(data),
		success: function(response) {
			console.log(response);
			
			var l = response.length - 1;
			
			var tr = $('<tr>');
			tr.append('<td>' + response[l].model + '</td>');
			tr.append('<td>' + response[l].engine + '</td>');
			tr.append('<td>' + response[l].seats + '</td>');
			tr.append('<td>' + response[l].maxWeight + '</td>');
			tr.append('<td>' + response[l].maxBaggage + '</td>');
			tr.append('<td>' + response[l].maxSpeed + '</td>');
			tr.append('</tr>');
			$('#planes').append(tr);
		}
	})
}); 