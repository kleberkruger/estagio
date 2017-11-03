import { User } from './../../modelos/User';
import { Injectable } from '@angular/core';
import { Http, Headers, RequestOptions, Response } from '@angular/http';


@Injectable()
export class LoginService {
    constructor(private http: Http) { }

    logar(passaporte: string, senha: string) {
        var headers = new Headers();
        headers.append('Content-Type', 'application/json');
        // let urlSearchParams = new URLSearchParams();
        // urlSearchParams.set('passaporte', email);
        // urlSearchParams.set('senha', senha);
        let bodyString = JSON.stringify({"passaporte":passaporte,"senha":senha})
        let options = new RequestOptions({ headers:headers});
        return this.http.post('https://sistemas5.ufms.br/seguranca/rest/authentication',bodyString,options)
            .map((response: Response) => {
                let body = response.json();
                if (body) {
                        localStorage.setItem('currentUser', JSON.stringify(body));
                                    }
            });
    }

    create(user: User) {
        console.log("AQUI PORA", user);
        return this.http.post('http://localhost:3000/api/usuario/save', user).map((response: Response) => response.json());
    }


    logout() {
        // remove user from local storage to log user out
        localStorage.removeItem('currentUser');
    }
}