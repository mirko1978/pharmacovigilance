# Eclipse configurations

## Code templates.

Open the eclipse preferences then go into

		Java -> Code Styles -> Code templates

Click on *Import* and select the [codetemplates.xml](codetemplates.xml) file.  
Please note that in `Comments -> Types` your name and email has to be put there.

## Formatter

Open the eclipse preferences then go into

		Java -> Code Styles -> Formatter

Click on *Import* and select [formatter.xml](formatter.xml) file.  
Please note that this version enable the tags:

*	`// @formatter:off` in order to disable the automatic format of the code for a code section
*	`// @formatter:on` in order to enable again the format of the code

This tags are really useful when you are handling the fluent interface and API on Java.

## Data for testing

ICSR are private and it is not possible to public on github.  
The data used for unit test is on `G:\SharedAreas\IT\Applications\Pharmacovigilance`. 
The contenct of `data` folder has to be copied into `src/test/resources/data`.

## Avoid weblogic user/password

In many situations weblogic ask for user and password also if it is launched by eclipse / intellij.  
In order to avoid to type every time the admin user and password:  
Create `boot.properties` files with

    username=weblogic
    password=weblogic1
    
The file has to be saved inside your security server folder.  
For example `C:\devtools\weblogic\12.1.2\user_projects\domains\base_domain\servers\Server-1\security`

