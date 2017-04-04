var express = require('express');
var router = express.Router();
var mysql      = require('mysql');

var connection = mysql.createConnection({
  host     : 'localhost',
  user     : 'root',
  password : '',
  database : 'Vehicle'
});

connection.connect(function(err){
  if(!err) {
    console.log("Database is connected ... nn");
    /*connection.query('SELECT * from Borrower LIMIT 2', function(err, rows, fields) {
     connection.end();
     if (!err)
     console.log('The solution is: ', rows);
     else
     console.log('Error while performing Query.');
     });*/
  } else {
    console.log("Error connecting database ... nn");
  }
});

connection.query('select Location from details',function (err,rows,fields) {
  console.log("rows"+JSON.stringify(rows));
  /*res.render("payment",{
    books:rows
  });*/
})

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});

/*router.post('/payment',function (req,res,next) {

});*/

module.exports = router;
