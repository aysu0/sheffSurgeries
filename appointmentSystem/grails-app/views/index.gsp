<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Sheffield Surgeries Appointment System</title>
</head>
<body>
<div class="row">
<asset:image src=""/>
</div>
<content tag="nav">
    <h1 style = "font-size: 30px; color: white; text-align: left;"><strong>Welcome to Sheffield Surgeries Appointment System</strong></h1>
    <li class="dropdown">
                <li class="nav-item"><a href="/" class="nav-link link-dark px-2 active" aria-current="page">Home</a></li>
                <li class="nav-item"><a href="/doctor/index" class="nav-link link-dark px-2">Doctors</a></li>
	            <li class="nav-item"><a href="/nurse/index" class="nav-link link-dark px-2">Nurses</a></li>
	            <li class="nav-item"><a href="/receptionist/index" class="nav-link link-dark px-2">Receptionists</a></li>
	            <li class="nav-item"><a href="/patient/index" class="nav-link link-dark px-2">Patients</a></li>
	            <li class="nav-item"><a href="/appointment/index" class="nav-link link-dark px-2">Appointments</a></li>
	            <li class="nav-item"><a href="/prescription/index" class="nav-link link-dark px-2">Prescriptions</a></li>
                <li class="nav-item"><a href="/surgery/index" class="nav-link link-dark px-2">Surgeries</a></li>
                
        </ul>
    </li>
</content>

<div class="svg" role="presentation">
    <div class="hospital-banner">
        <img src="/assets/banner.jpg" class="grails-logo" img style="height:500px; width: 2000px;"/>
    </div>
</div>

<div id="content" role="main">
    <div class="container">
        <section class="row colset-2-its">
            <h1 style = "text-align: left;">Sheffield Surgeries - Appointment Systems</h1>


            <div id="controllers" role="navigation">
                <h2>Welcome to Sheffield Surgeries Appointment System! Our user-friendly platform is designed to make scheduling appointments with your healthcare providers a breeze. We look forward to serving you and your family for all your healthcare needs!</h2>
                <ul>
                    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">

                    </g:each>
                </ul>
            </div>
        </section>
    </div>
</div>

</body>
</html>
