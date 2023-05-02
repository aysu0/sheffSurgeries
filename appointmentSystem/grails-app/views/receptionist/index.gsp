<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'receptionist.label', default: 'Receptionist')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
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
    <div id="content" role="main">
        <div class="container">
            <section class="row">
                <a href="#list-receptionist" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
                <div class="nav" role="navigation">
                    <ul>
                        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                        <li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
                    </ul>
                </div>
            </section>
            <section class="row">
                <div id="list-receptionist" class="col-12 content scaffold-list" role="main">
                    <h1><g:message code="default.list.label" args="[entityName]" /></h1>
                    <g:if test="${flash.message}">
                        <div class="message" role="status">${flash.message}</div>
                    </g:if>
                    <f:table collection="${receptionistList}" />

                    <g:if test="${receptionistCount > params.int('max')}">
                    <div class="pagination">
                        <g:paginate total="${receptionistCount ?: 0}" />
                    </div>
                    </g:if>
                </div>
            </section>
        </div>
    </div>
    </body>
</html>