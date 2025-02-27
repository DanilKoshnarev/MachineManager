pub struct Machine {
    pub id: i32,
    pub name: String,
    pub status: String,
}

impl Machine {
    pub fn new(id: i32, name: String, status: String) -> Self {
        Self { id, name, status }
    }
}
