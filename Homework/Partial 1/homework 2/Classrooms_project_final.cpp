#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h>
#include <cctype>
#include <cstdlib>
#include <windows.h>
//!Formato Estructura a Guardar en el archivo
typedef struct {
    int codigo=0;
    char nombre[40];
    char codigoLab[40]="NINGUNO";
    char horario[40]="NINGUNO";
    char estado ='O';
    char visible='S';
} registro;

//!Declaración de variables globales
registro reg;
registro laboratorio;
FILE *archivo;          //!Declaracion de un puntero tipo FILE
char nom_archivo[80]="NINGUNO";   //!Declaracion de variables
int cont=1;

//!Declaración de Funciones
void presentacion();
void desbloquear();
void menu();
void subMenuCodigoLab();
void subMenuHorario();
void crear();
registro DatosLaboratorio(int cont);   //!Función de tipo Estructura
void ingresar();
void mostrar();
void consultar();
void modificar();
void eliminar();
void seleccionarArchivo(){
    printf("\nIngrese el nombre del archivo: ");
    scanf("%s",nom_archivo);
    fflush(stdin);
    strcat(nom_archivo, ".dat");   //!Pone la extensión.dat
}

int main(){
    presentacion();
    menu();
    return 0;
}

void presentacion(){
    char op;
    int segundos=1;
    system("color 70");//colores y letras iniciales de pantalla
    do{
        system("cls");
        printf("\t\t*******        *******         *******       *******\n");
        printf("\t\t*******        *******         *******       *******\n");
        printf("\t\t**             **              **   **       **     \n");
        printf("\t\t**             **              **   **       **     \n");
        printf("\t\t*******        *******         *******       *******\n");
        printf("\t\t*******        *******         *******       *******\n");
        printf("\t\t**                  **         **            **     \n");
        printf("\t\t**                  **         **            **     \n");
        printf("\t\t*******        *******         **            *******\n");
        printf("\t\t*******        *******         **            *******\n");
        printf("\n\n*******  BIENVENIDOS AL SISTEMA DE REGISTRO DE LABORATORIOS DE LA ESPE  *******\n\n");
        printf("\t\t\t\tDesea continuar: S/N: ");
        scanf("%c",&op);
        fflush(stdin);
    }while (op!='s'&&op!='S'&&op!='n'&&op!='N');//validacion de entrada de teclado
    if (op=='n'||op=='N'){
        exit(0);
    }
    system("color 1f");//establece el cambio de color de pantalla
    printf("\n\n\nCARGANDO...\n\n");
    for(int i=0; i<=79; i++)
    {
        printf("°");//grafico de carga en codigo ascii
        Sleep(segundos*1000/80);//Genera la secuencia de la barra de carga
    }
    desbloquear();
}

void desbloquear()
{
    system("cls");
    int intentos=0;
    int sw=0;
    int faltan=3;
    char usuario[25];
    char clave[5];
    do {
        ini:
        int x=0;
        system("cls");
        system("color 70");
        printf("\n\n\n\n\n              Ingrese el nombre del usuario: ");
        scanf("%s",usuario);
        printf("\n              Introduce la contrase%ca: ",164);
        while(((clave[x]=(char)getch())!=13))//asignacion de cadena de caracteres al array y exclusion del enter
        {
           printf("*");
           x++;
        }
        clave[x]='\0';
        intentos++;
        faltan--;

        if(strcmp(usuario,"admin"))//comprovacion de cadena de caracteres
        {
           system("color 40");
           printf("\n\n\n\n              USUARIO INCORRECTO\n");
           printf("\n              Te faltan %d intentos", faltan);
           getch();
           if(intentos<3)
            {
             goto ini;//sentencia de repeticion
            }
        }else{
            if(strcmp(clave,"1234"))//comprovacion de cadena de caracteres
            {
               system("color 40");
               printf("\n\n\n\n              CONTRASE%cA INCORRECTA\n",165);
               printf("\n              Te faltan %d intentos", faltan);
               getch();
               if(intentos<3)
                {
                 goto ini;//sentencia de repeticion
                }
            }else{
                sw=1;
            }
        }
    } while (intentos<3 && sw != 1);

    if(sw==1)
	{
        system("color 2f");
        printf("\n\n\n\n\n                      ***************BIENVENIDO***************");
        int segundos=1;
        printf("\n\n\nCARGANDO...\n\n");
        for(int i=0; i<=79; i++)
        {
            printf("°");//grafico de carga en codigo ascii
            Sleep(segundos*1000/80);//Genera la secuencia de la barra de carga
        }
    }else{
        system("cls");
        printf("\n\n\n\n\n\n               *******************CONTRASE%cA INCORRECTA*******************",164);
        getch();
        int segundos=1;
        printf("\n\n\tFORMATEANDO EL COMPUTADOR...\n\n");
        for(int i=0; i<=79; i++)
        {
            printf("°");//grafico de carga en codigo ascii
            Sleep(segundos*10000/80);//Genera la secuencia de la barra de carga
        }
        printf("\n\n\n\n\n\n\n                       SE MOSTRARA LA PANTALLA DE PRESENTACION");
        getch();
        presentacion();
    }
}

void menu(){
    int opcion;
    do {
        system("cls");
        printf("\t                                               %s\n",nom_archivo);
        printf("\t*************************   MENU   *************************\n");
        printf("\t***                                                      ***\n");
        printf("\t***  1.- Crear o seleccionar un \"Archivo Binario\"        ***\n");
        printf("\t***  2.- Ingresar datos del laboratorio                  ***\n");
        printf("\t***  3.- Mostrar datos de los laboratorios               ***\n");
        printf("\t***  4.- Consultar un laboratorio por su c%cdigo          ***\n",162);
        printf("\t***  5.- Modificar el estado de un laboratorio           ***\n");
        printf("\t***  6.- Eliminar un registro                            ***\n");
        printf("\t***  7.- Salir                                           ***\n");
        printf("\t***                                                      ***\n");
        printf("\t************************************************************\n");
        printf("\t\t\tIngrese su opci%cn: ",162);
        scanf("%i",&opcion);
        fflush(stdin);
        switch (opcion) {
            case 1:
                crear();
                break;
            case 2:
                ingresar();
                break;
            case 3:
                mostrar();
                break;
            case 4:
                consultar();
                break;
            case 5:
                modificar();
                break;
            case 6:
                eliminar();
                break;
            case 7:
                printf("\n\t\t\tGracias por usar el programa...\n\n");
                break;
            default:
                printf("\n\t\t\t\tOpci\242n fuera de rango..\n\n");
                system("pause");
        }
    } while (opcion!=7);
}

void subMenuCodigoLab(){
    int opcion;
    strcpy(laboratorio.codigoLab, "NINGUNO");
    do {
        system("cls");
        printf("\t******************* SUB MENU DE LABORATORIOS *******************\n");
        printf("\t***                                                          ***\n");
        printf("\t***  1.- H-201     7.- G-201     13.- H-301    19.- G-301    ***\n");
        printf("\t***  2.- H-202     8.- G-202     14.- H-302    20.- G-302    ***\n");
        printf("\t***  3.- H-203     9.- G-203     15.- H-303    21.- G-303    ***\n");
        printf("\t***  4.- H-204    10.- G-204     16.- H-304    22.- G-304    ***\n");
        printf("\t***  5.- H-205    11.- G-205     17.- H-305    23.- G-305    ***\n");
        printf("\t***  6.- H-206    12.- G-206     18.- H-306    24.- G-306    ***\n");
        printf("\t***                                                          ***\n");
        printf("\t****************************************************************\n");
        printf("\n\t\t\tSeleccione el n%cmero del Laboratorio : ",163);
        scanf("%i",&opcion);
        fflush(stdin);
        switch (opcion) {
            case 1:
                strcpy(laboratorio.codigoLab,"H-201");
                break;
            case 2:
                strcpy(laboratorio.codigoLab, "H-202");
                break;
            case 3:
                strcpy(laboratorio.codigoLab, "H-203");
                break;
            case 4:
                strcpy(laboratorio.codigoLab, "H-204");
                break;
            case 5:
                strcpy(laboratorio.codigoLab, "H-205");
                break;
            case 6:
                strcpy(laboratorio.codigoLab, "H-206");
                break;
            case 7:
                strcpy(laboratorio.codigoLab, "G-201");
                break;
            case 8:
                strcpy(laboratorio.codigoLab, "G-202");
                break;
            case 9:
                strcpy(laboratorio.codigoLab, "G-203");
                break;
            case 10:
                strcpy(laboratorio.codigoLab, "G-204");
                break;
            case 11:
                strcpy(laboratorio.codigoLab, "G-205");
                break;
            case 12:
                strcpy(laboratorio.codigoLab, "G-206");
                break;
            case 13:
                strcpy(laboratorio.codigoLab, "H-301");
                break;int opcion;
            case 14:
                strcpy(laboratorio.codigoLab, "H-302");
                break;
            case 15:
                strcpy(laboratorio.codigoLab, "H-303");
                break;
            case 16:
                strcpy(laboratorio.codigoLab, "H-304");
                break;
            case 17:
                strcpy(laboratorio.codigoLab, "H-305");
                break;
            case 18:
                strcpy(laboratorio.codigoLab, "H-306");
                break;
            case 19:
                strcpy(laboratorio.codigoLab, "G-301");
                break;
            case 20:
                strcpy(laboratorio.codigoLab, "G-302");
                break;
            case 21:
                strcpy(laboratorio.codigoLab, "G-303");
                break;
            case 22:
                strcpy(laboratorio.codigoLab, "G-304");
                break;
            case 23:
                strcpy(laboratorio.codigoLab, "G-305");
                break;
            case 24:
                strcpy(laboratorio.codigoLab, "G-306");
                break;
            default:
                printf("\n\t\t\t\tOpci\242n fuera de rango..\n\n\t\t\t");
        }
        printf("\n\t\t\tEl laboratorio seleccionado es: %s\n\t\t\t",laboratorio.codigoLab);
        system("pause");
    } while (opcion<1 || opcion>24);
}

void subMenuHorario(){
    int opcion;
    strcpy(laboratorio.horario, "NINGUNO");
    do {
        system("cls");
        printf("\t***** SUBMENU DE HORARIOS DE LOS LABORATORIOS *****\n");
        printf("\t***                                             ***\n");
        printf("\t***              1.- 07H15 A 09H15              ***\n");
        printf("\t***              2.- 09H15 A 11H30              ***\n");
        printf("\t***              3.- 12H00 A 14H00              ***\n");
        printf("\t***              4.- 15H00 A 17H00              ***\n");
        printf("\t***              5.- 17H15 A 19H15              ***\n");
        printf("\t***              6.- 19H30 A 21H30              ***\n");
        printf("\t***                                             ***\n");
        printf("\t***************************************************\n");
        //!160,130,161,162,163 códigos ASCII o sé pone á por \240,é por \202,í por \241,ó por \242,ú por \243
        printf("\n\t\tSeleccione el Horario : ");
        scanf("%i",&opcion);
        fflush(stdin);
        switch (opcion) {
            case 1:
                strcpy(laboratorio.horario, "07H15 A 09H15");
                break;
            case 2:
                strcpy(laboratorio.horario, "09H15 A 11H30");
                break;
            case 3:
                strcpy(laboratorio.horario, "12H00 A 14H00");
                break;
            case 4:
                strcpy(laboratorio.horario, "15H00 A 17H00");
                break;
            case 5:
                strcpy(laboratorio.horario, "17H15 A 19H15");
                break;
            case 6:
                strcpy(laboratorio.horario, "19H15 A 21H30");
                break;
            default:
                printf("\n\t\t\tDebe seleccionar un Horario.....\n\n\t\t");
        }
        printf("\n\t\tHorario seleccionado: %s\n\n\t\t",laboratorio.horario);
        system("pause");
    } while (opcion<1 || opcion>6);
}

void crear(){
    system("cls");
    seleccionarArchivo();
    archivo = fopen(nom_archivo, "rb");
    if (archivo==NULL){
        archivo = fopen(nom_archivo, "wb");     //!Apertura del Archivo con modo de escritura en binario
        printf("\nCreando el archivo...\n");
    }else{
        printf("\nSe selecciono el archivo...\n");
    }
    system("pause");
    fclose(archivo);
}

registro DatosLaboratorio(int cont){
    laboratorio.codigo=cont+1;
    printf("\n\t\t********** INGRESO DE DATOS **********\n");
    printf("\n\tIngrese el nombre del responsable: ");
    gets(laboratorio.nombre);
    subMenuCodigoLab();
    subMenuHorario();
    laboratorio.estado='O';
    laboratorio.visible='S';
    return laboratorio;
}

void ingresar(){
    system("cls");
    char opc='s';
    if (archivo==NULL){
        printf("\nNo existe el archivo...\n");
    }else{
        archivo = fopen(nom_archivo, "r+b");     //!Apertura del Archivo con modo de lectura
        cont=0;
        registro laboratorio;
        fread(&laboratorio, sizeof(registro), 1, archivo);
        while(!feof(archivo)){
            fread(&laboratorio, sizeof(registro), 1, archivo);
            cont=cont+1;
        }
        archivo = fopen(nom_archivo, "ab");   //!Apertura del Archivo con modo de agregar
        reg = DatosLaboratorio(cont);     //!carga de datos Laboratorio

        FILE *arch;
        arch = fopen(nom_archivo, "r+b");
        registro lab;
        int existe=0;
        fread(&lab, sizeof(registro), 1, arch);
        while(!feof(arch)) {
           if (strcmp(reg.codigoLab,lab.codigoLab)){
                printf("");
            }else{
               if (strcmp(reg.horario,lab.horario)){
                    printf("");
                }else{

                    existe=1;
                    break;
                }
            }
            fread(&lab, sizeof(registro), 1, arch);
        }
        if (existe==0){
            printf("\nGuardando el archivo...\n");
            fwrite(&reg, sizeof(registro),1, archivo);
        }else{
            printf("\nNo se puede guardar el archivo...porque el archivo que trata de ingresar...\n");
            printf("  %i    %s          %s        %s           %c\n", reg.codigo,reg.nombre, reg.codigoLab, reg.horario, reg.estado);
            printf("\nSe repite con.......\n");
            printf("  %i    %s          %s        %s           %c\n", lab.codigo,lab.nombre, lab.codigoLab, lab.horario, lab.estado);
        }
    }
    fclose(archivo);
    system("pause");
}

void mostrar(){
    archivo = fopen(nom_archivo, "r+b");     //!Apertura del Archivo con modo de lectura rb
    if (archivo==NULL){
        printf("\nNo existe el archivo...\n");
    }else{
        registro laboratorio;
        fread(&laboratorio, sizeof(registro), 1, archivo);
        printf("\n\n****************************************************************\n");
        printf("***                VISUALIZACIÓN DE LOS DATOS                ***\n");
        printf("****************************************************************\n");
        printf("Cod   Laboratorista        Laboratorio     Horario       Estado\n");
        printf("****************************************************************\n\n");
        while(!feof(archivo)){
            if (laboratorio.visible=='S'){
                printf("  %i    %s          %s        %s           %c\n", laboratorio.codigo,
                    laboratorio.nombre, laboratorio.codigoLab, laboratorio.horario, laboratorio.estado);
            }
            fread(&laboratorio, sizeof(registro), 1, archivo);
        }
    }
    fclose(archivo);
    printf("\n");
    system("pause");
}

void consultar(){
    archivo = fopen(nom_archivo, "rb");     //!Apertura del Archivo con modo de lectura
    if (archivo==NULL){
        printf("\nNo existe el archivo...\n");
    }else{
        printf("\nIngrese el c\242digo de laboratorio a consultar:");
        int cod;
        scanf("%i", &cod);
        registro laboratorio;
        int existe=0;
        fread(&laboratorio, sizeof(registro), 1, archivo);
        printf("\n\n****************************************************************\n");
        printf("***                VISUALIZACIÓN DE LOS DATOS                ***\n");
        printf("****************************************************************\n");
        printf("Cod   Laboratorista        Laboratorio     Horario       Estado\n");
        printf("****************************************************************\n\n");
        while(!feof(archivo))
        {
            if (cod==laboratorio.codigo)
            {
               printf("%i    %s     %s    %s     %c\n", laboratorio.codigo, laboratorio.nombre,
                      laboratorio.codigoLab, laboratorio.horario, laboratorio.estado);
               existe=1;
               break;
            }
            fread(&laboratorio, sizeof(registro), 1, archivo);
        }
        if (existe==0){
            printf("\nNo existe un laboratorio con dicho c\242digo...\n");
        }
    }

    fclose(archivo);
    system("pause");
}

void modificar(){
    char est;
    archivo = fopen(nom_archivo, "r+b");     //!Apertura del Archivo
    if (archivo==NULL){
        printf("\nNo existe el archivo...\n");
    }else{
        printf("\nIngrese el c\242digo de laboratorio a modificar: ");
        int cod;
        scanf("%i", &cod);
        registro laboratorio;
        int existe=0;
        fread(&laboratorio, sizeof(registro), 1, archivo);
        while(!feof(archivo))
        {
            if (cod==laboratorio.codigo)
            {
                printf("%i    %s     %s    %s     %c\n", laboratorio.codigo, laboratorio.nombre,
                      laboratorio.codigoLab, laboratorio.horario, laboratorio.estado);
                int pos=ftell(archivo)-sizeof(registro);
                fseek(archivo,pos,SEEK_SET);
                laboratorio.estado='D';
                fwrite(&laboratorio, sizeof(registro), 1, archivo);
                printf("\nSe modific\242 el estado del laboratorio...\n");
                existe=1;
                break;
            }
            fread(&laboratorio, sizeof(registro), 1, archivo);
        }
        if (existe==0){
            printf("\nNo existe un laboratorio con dicho c\242digo...\n");
        }
    }
    fclose(archivo);
    system("pause");
}

void eliminar(){
    system("cls");
    char opcion;
    archivo = fopen(nom_archivo, "r+b");     //!Apertura del Archivo
    if (archivo==NULL){
        printf("\nNo existe el archivo...\n");
    }else{
        printf("Ingrese el c\242digo de laboratorio a eliminar: ");
        int cod;
        scanf("%i", &cod);
        registro laboratorio;
        int existe=0;
        fread(&laboratorio, sizeof(registro), 1, archivo);
        while(!feof(archivo)){
            if (cod==laboratorio.codigo) {
               printf("%i    %s     %s    %s     %c\n", laboratorio.codigo, laboratorio.nombre,
                     laboratorio.codigoLab, laboratorio.horario, laboratorio.estado);
               int pos=ftell(archivo)-sizeof(registro);
               fseek(archivo,pos,SEEK_SET);
               laboratorio.codigo=NULL;
               laboratorio.nombre[40]=NULL;
               laboratorio.codigoLab[40]=NULL;
               laboratorio.horario[40]=NULL;
               laboratorio.estado =NULL;
               laboratorio.visible=NULL;
               fwrite(&laboratorio, sizeof(registro), 1, archivo);
               printf("\nSe elimin\242 el registro de dicho laboratorio.\n");
               existe=1;
               break;
            }
            fread(&laboratorio, sizeof(registro), 1, archivo);
        }
        if (existe==0){
            printf("No existe un laboratorio con dicho c\242digo...\n");
        }
    }
    fclose(archivo);
    system("pause");
}
