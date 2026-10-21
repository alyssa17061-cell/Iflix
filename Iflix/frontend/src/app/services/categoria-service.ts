import { HttpClient } from '@angular/common/http';
import { inject, Service } from '@angular/core';
import { Observable } from 'rxjs';
import { Categoria } from '../models/categoria';

@Service()
export class CategoriaService {

     http:HttpClient = inject(HttpClient);

    listarCategorias() : Observable<Categoria[]> {
       return this.http.get<Categoria[]>('http://localhost:8080/categoria');
    }
}
