import React, { useState } from 'react';

function Dashboard() {
    // Define some renamed fake documents to display
    const [documents] = useState([
        { id: 1, name: 'Project Proposal' },
        { id: 2, name: 'Financial Report Q1' },
        { id: 3, name: 'Team Meeting Notes' }
    ]);

    // State for search term
    const [searchTerm, setSearchTerm] = useState('');

    // Handle search input change
    const handleSearch = (event) => {
        setSearchTerm(event.target.value);
    };

    // Filter documents based on search term
    const filteredDocuments = documents.filter((doc) =>
        doc.name.toLowerCase().includes(searchTerm.toLowerCase())
    );

    return (
        <div className="dashboard">
            <input
                type="text"
                placeholder="Search documents"
                value={searchTerm}
                onChange={handleSearch}
                style={{ padding: '10px', margin: '10px 0', width: '100%' }}
            />
            <ul>
                {filteredDocuments.length > 0 ? (
                    filteredDocuments.map((doc) => (
                        <li key={doc.id} style={{ padding: '10px', border: '1px solid #ccc', color: '#000' }}>
                            {doc.name}
                            <div>
                                <button style={{ marginRight: '10px', backgroundColor: 'yellow', color: '#000' }}>Update</button>
                                <button style={{ backgroundColor: 'red', color: '#fff' }}>Delete</button>
                            </div>
                        </li>
                    ))
                ) : (
                    <p>No documents found.</p>
                )}
            </ul>
        </div>
    );
}

export default Dashboard;
