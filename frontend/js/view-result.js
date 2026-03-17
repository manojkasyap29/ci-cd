fetch('http://localhost:8090/api/result')
    .then(res=>res.json())
    .then(data => {

        const table = document.getElementById('resultTable');
        data.forEach(r=>{
            table.innerHTML += `
            <tr>
             <td>${r.id}</td>
             <td>${r.studentName}</td>
             <td>${r.examId}</td>
             <td>${r.score}</td>
            </tr>
            `;
        });
    })
    .catch(()=>{
        document.getElementById("resultTable").innerHTML = "<tr><td colspan='4'>Failed to load result</td></tr>";
    }) 
