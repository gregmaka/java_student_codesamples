<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<!-- needs to be locked down -->
<h1>Folk on our mailing list</h1>
<?php
    if (registered_users){
        foreach($registered_users as $user) {
            list($name, $email) = $user;
            echo "<li>$name: <a href='mailto:$email'>$email</a></li>";
            }
        }else{
            echo "<li>No Registered Users.</li>";
        }
?>

</body>
</html>