package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QPessoaJuridica is a Querydsl query type for PessoaJuridica
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPessoaJuridica extends EntityPathBase<PessoaJuridica> {

    private static final long serialVersionUID = 561329602L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPessoaJuridica pessoaJuridica = new QPessoaJuridica("pessoaJuridica");

    public final QPessoa _super;

    //inherited
    public final StringPath cpfCnpj;

    //inherited
    public final DateTimePath<java.util.Date> dataAtualizacao;

    //inherited
    public final DateTimePath<java.util.Date> dataCriacao;

    // inherited
    public final QEndereco endereco;

    //inherited
    public final CollectionPath<EnderecoEletronico, QEnderecoEletronico> enderecosEletronicos;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath nome;

    public final StringPath razaoSocial = createString("razaoSocial");

    //inherited
    public final CollectionPath<Telefone, QTelefone> telefones;

    //inherited
    public final EnumPath<br.ufms.estagio.enumerate.TipoPessoa> tipoPessoa;

    public QPessoaJuridica(String variable) {
        this(PessoaJuridica.class, forVariable(variable), INITS);
    }

    public QPessoaJuridica(Path<? extends PessoaJuridica> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPessoaJuridica(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPessoaJuridica(PathMetadata<?> metadata, PathInits inits) {
        this(PessoaJuridica.class, metadata, inits);
    }

    public QPessoaJuridica(Class<? extends PessoaJuridica> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QPessoa(type, metadata, inits);
        this.cpfCnpj = _super.cpfCnpj;
        this.dataAtualizacao = _super.dataAtualizacao;
        this.dataCriacao = _super.dataCriacao;
        this.endereco = _super.endereco;
        this.enderecosEletronicos = _super.enderecosEletronicos;
        this.id = _super.id;
        this.nome = _super.nome;
        this.telefones = _super.telefones;
        this.tipoPessoa = _super.tipoPessoa;
    }

}

