import styles from '../css/ComponentesProps.module.css'
function ComponentesProps({place,text,flag}){

    return(
        <div className={styles.corpo_props} >
            <h2>Venha conhecer esse lugar incrível: {place}!!!</h2>
            <p>{text}</p>
            <img src={flag} alt="" />

        </div>

    )
}

export default ComponentesProps