package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QPessoaFisica is a Querydsl query type for PessoaFisica
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPessoaFisica extends EntityPathBase<PessoaFisica> {

    private static final long serialVersionUID = -415487468L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPessoaFisica pessoaFisica = new QPessoaFisica("pessoaFisica");

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

    public final StringPath nacionalidade = createString("nacionalidade");

    //inherited
    public final StringPath nome;

    public final NumberPath<Integer> rgNumero = createNumber("rgNumero", Integer.class);

    public final StringPath rgOrgaoExpedidor = createString("rgOrgaoExpedidor");

    //inherited
    public final CollectionPath<Telefone, QTelefone> telefones;

    //inherited
    public final EnumPath<br.ufms.estagio.enumerate.TipoPessoa> tipoPessoa;

    public QPessoaFisica(String variable) {
        this(PessoaFisica.class, forVariable(variable), INITS);
    }

    public QPessoaFisica(Path<? extends PessoaFisica> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPessoaFisica(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPessoaFisica(PathMetadata<?> metadata, PathInits inits) {
        this(PessoaFisica.class, metadata, inits);
    }

    public QPessoaFisica(Class<? extends PessoaFisica> type, PathMetadata<?> metadata, PathInits inits) {
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

