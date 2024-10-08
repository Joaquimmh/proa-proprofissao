import Style from"./Header.module.css";

function Header(){
    return(

        <>
            <div className={Style.cabecalho}>
               <h1 className={Style.titulo}> Header da página </h1>
            </div>

        </>

    )
}
export default Header