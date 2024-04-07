import { apiSlice } from '../api/apiSlice'

export const productsApi = apiSlice.injectEndpoints({
  endpoints: (builder) => ({
    addProduct: builder.mutation({
      query: (data) => ({
        url: '/todos',
        method: 'POST',
        body: data,
      }),
    }),
    getProducts: builder.query({
      query: () => `/todos`,
    }),
  }),
})
export const { useGetProductsQuery, useAddProductMutation } = productsApi
