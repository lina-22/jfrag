import { createSlice } from '@reduxjs/toolkit'

const initialState = {
  todos: [],
}

const productsSlice = createSlice({
  name: 'products',
  initialState,
  reducers: {
    addProduct: (state, action) => {
      state.todos.push(action.payload.todo)
    },
  },
})

export const {} = productsSlice.actions
export default productsSlice.reducer
