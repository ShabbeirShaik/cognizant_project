import React, {useState } from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Container , Paper ,Button} from '@material-ui/core';

export default function Body() {
  const paperStyle={padding:'50px 20px' , width:600,margin:"20px auto"}
  const [name,setName]=useState('')
  const [address,setAddress]=useState('')
  const [travelAgents,setTravelAgents]=useState('')
  const handleClick=(e)=>{
    
    const travelAgent={name,address}
    console.log(travelAgent)
    
    
    fetch("http://localhost:8080/travelAgent/add",{
      method:"POST",
      headers:{"Content-type":"application/json"},
      body:JSON.stringify(travelAgent)
    }).then(()=>{
      console.log("New location is added")
    })
    
  }
  
  return (
    <div className="body1">
    <Container>
      
        <h1 style={{color:"Black"}}><b><i>Add your favourite location</i></b></h1><br></br>
    <Box
      component="form"
      sx={{
        '& > :not(style)': { m: 1, width: '25ch' },
      }}
      noValidate
      autoComplete="off"
    >
      <TextField id="outlined-basic" label="Travelling location"variant="outlined" fullWidth value={name} onChange={(e)=>setName(e.target.value)}/>
      <TextField id="outlined-basic" label="Address" variant="outlined" fullWidth value={address} onChange={(e)=>setAddress(e.target.value)}/><br></br>
      <Button variant="contained" color="secondary" onClick={handleClick}>submit
      </Button>
      
    </Box>
    
    </Container>
    </div>
  );
}
